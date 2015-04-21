package com.asana.resources.gen;

import com.asana.Client;
import com.asana.resources.Resource;
import com.asana.models.Project;
import com.asana.requests.ItemRequest;
import com.asana.requests.CollectionRequest;

/**
 * A _project_ represents a prioritized list of tasks in Asana. It exists in a
 * single workspace or organization and is accessible to a subset of users in
 * that workspace or organization, depending on its permissions.
 * 
 * Projects in organizations are shared with a single team. You cannot currently
 * change the team of a project via the API. Non-organization workspaces do not
 * have teams and so you should not specify the team of project in a
 * regular workspace.
 */
public class ProjectsBase extends Resource
{
    /**
     * @param client Parent client instance
     */
    public ProjectsBase(Client client)
    {
        super(client);
    }

    /**
     * Creates a new project in a workspace or team.
     * 
     * Every project is required to be created in a specific workspace or
     * organization, and this cannot be changed once set. Note that you can use
     * the `workspace` parameter regardless of whether or not it is an
     * organization.
     * 
     * If the workspace for your project _is_ an organization, you must also
     * supply a `team` to share the project with.
     * 
     * Returns the full record of the newly created project.
     *
     * @return Request object
     */
    public ItemRequest<Project> create()
    {
        return new ItemRequest<Project>(this, Project.class, "/projects", "POST");
    }

    /**
     * If the workspace for your project _is_ an organization, you must also
     * supply a `team` to share the project with.
     * 
     * Returns the full record of the newly created project.
     *
     * @param  workspace The workspace or organization to create the project in.
     * @return Request object
     */
    public ItemRequest<Project> createInWorkspace(String workspace)
    {
        String path = String.format("/workspaces/%s/projects", workspace);
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }

    /**
     * Creates a project shared with the given team.
     * 
     * Returns the full record of the newly created project.
     *
     * @param  team The team to create the project in.
     * @return Request object
     */
    public ItemRequest<Project> createInTeam(String team)
    {
        String path = String.format("/teams/%s/projects", team);
        return new ItemRequest<Project>(this, Project.class, path, "POST");
    }

    /**
     * Returns the complete task record for a single task.
     *
     * @param  task The task to get.
     * @return Request object
     */
    public ItemRequest<Project> findById(String task)
    {
        String path = String.format("/projects/%s", task);
        return new ItemRequest<Project>(this, Project.class, path, "GET");
    }

    /**
     * A specific, existing project can be updated by making a PUT request on the
     * URL for that project. Only the fields provided in the `data` block will be
     * updated; any unspecified fields will remain unchanged.
     * 
     * When using this method, it is best to specify only those fields you wish
     * to change, or else you may overwrite changes made by another user since
     * you last retrieved the task.
     * 
     * Returns the complete updated project record.
     *
     * @param  project The project to update.
     * @return Request object
     */
    public ItemRequest<Project> update(String project)
    {
        String path = String.format("/projects/%s", project);
        return new ItemRequest<Project>(this, Project.class, path, "PUT");
    }

    /**
     * A specific, existing project can be deleted by making a DELETE request
     * on the URL for that project.
     * 
     * Returns an empty data record.
     *
     * @param  project The project to delete.
     * @return Request object
     */
    public ItemRequest<Project> delete(String project)
    {
        String path = String.format("/projects/%s", project);
        return new ItemRequest<Project>(this, Project.class, path, "DELETE");
    }

    /**
     * Returns the compact project records for some filtered set of projects.
     * Use one or more of the parameters provided to filter the projects returned.
     *
     * @return Request object
     */
    public CollectionRequest<Project> findAll()
    {
        return new CollectionRequest<Project>(this, Project.class, "/projects", "GET");
    }

    /**
     * Returns the compact project records for all projects in the workspace.
     *
     * @param  workspace The workspace or organization to find projects in.
     * @return Request object
     */
    public CollectionRequest<Project> findByWorkspace(String workspace)
    {
        String path = String.format("/workspaces/%s/projects", workspace);
        return new CollectionRequest<Project>(this, Project.class, path, "GET");
    }

    /**
     * Returns the compact project records for all projects in the team.
     *
     * @param  team The team to find projects in.
     * @return Request object
     */
    public CollectionRequest<Project> findByTeam(String team)
    {
        String path = String.format("/teams/%s/projects", team);
        return new CollectionRequest<Project>(this, Project.class, path, "GET");
    }
}
