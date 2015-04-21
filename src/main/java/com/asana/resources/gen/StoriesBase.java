package com.asana.resources.gen;

import com.asana.Client;
import com.asana.resources.Resource;
import com.asana.models.Story;
import com.asana.requests.ItemRequest;
import com.asana.requests.CollectionRequest;

/**
 * A _story_ represents an activity associated with an object in the Asana
 * system. Stories are generated by the system whenever users take actions such
 * as creating or assigning tasks, or moving tasks between projects. _Comments_
 * are also a form of user-generated story.
 * 
 * Stories are a form of history in the system, and as such they are read-only.
 * Once generated, it is not possible to modify a story.
 */
public class StoriesBase extends Resource
{
    /**
     * @param client Parent client instance
     */
    public StoriesBase(Client client)
    {
        super(client);
    }

    /**
     * Returns the full record for a single story.
     *
     * @param  story Globally unique identifier for the team.
     * @return Request object
     */
    public ItemRequest<Story> findById(String story)
    {
        String path = String.format("/stories/%s", story);
        return new ItemRequest<Story>(this, Story.class, path, "GET");
    }

    /**
     * Returns the compact records for all stories on the task.
     *
     * @param  task Globally unique identifier for the task.
     * @return Request object
     */
    public CollectionRequest<Story> findByTask(String task)
    {
        String path = String.format("/tasks/%s/stories", task);
        return new CollectionRequest<Story>(this, Story.class, path, "GET");
    }

    /**
     * Adds a comment to a task. The comment will be authored by the
     * currently authenticated user, and timestamped when the server receives
     * the request.
     * 
     * Returns the full record for the new story added to the task.
     *
     * @param  task Globally unique identifier for the task.
     * @return Request object
     */
    public ItemRequest<Story> createOnTask(String task)
    {
        String path = String.format("/tasks/%s/stories", task);
        return new ItemRequest<Story>(this, Story.class, path, "POST");
    }
}
