package com.asana.resources.gen;

import com.asana.Client;
import com.asana.resources.Resource;
import com.asana.requests.ItemRequest;
import com.asana.requests.CollectionRequest;
import com.asana.models.gen.ErrorResponse;
import com.asana.models.gen.PortfolioMembershipCompact;
import com.asana.models.gen.PortfolioMembershipResponse;
import java.io.IOException;
import java.util.List;

public class PortfolioMembershipsBase extends Resource {
    /**
    * @param client Parent client instance
    */
    public PortfolioMembershipsBase(Client client) { super(client); }

    /**
     * Get a portfolio membership
     * Returns the complete portfolio record for a single portfolio membership.
     * @param portfolioMembershipPathGid  (required)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return ItemRequest<PortfolioMembershipResponse>
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemRequest<PortfolioMembershipResponse> getPortfolioMembership(String portfolioMembershipPathGid, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolio_memberships/{portfolio_membership_gid}".replace("{portfolio_membership_path_gid}", portfolioMembershipPathGid);

        ItemRequest<PortfolioMembershipResponse> req = new ItemRequest<PortfolioMembershipResponse>(this, PortfolioMembershipResponse.class, path, "GET")
            .query("opt_pretty", optPretty)
            .query("opt_fields", optFields);

        return req;
    }

    public ItemRequest<PortfolioMembershipResponse> getPortfolioMembership(String portfolioMembershipPathGid) throws IOException {
        return getPortfolioMembership(portfolioMembershipPathGid, null, false);
    }

    /**
     * Get multiple portfolio memberships
     * Returns a list of portfolio memberships in compact representation. You must specify &#x60;portfolio&#x60;, &#x60;portfolio&#x60; and &#x60;user&#x60;, or &#x60;workspace&#x60; and &#x60;user&#x60;.
     * @param portfolio The portfolio to filter results on. (optional)
     * @param workspace The workspace to filter results on. (optional)
     * @param user The user to filter results on. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest<PortfolioMembershipCompact>
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<PortfolioMembershipCompact> getPortfolioMemberships(String portfolio, String workspace, String user, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolio_memberships";

        CollectionRequest<PortfolioMembershipCompact> req = new CollectionRequest<PortfolioMembershipCompact>(this, PortfolioMembershipCompact.class, path, "GET")
            .query("portfolio", portfolio)
            .query("workspace", workspace)
            .query("user", user)
            .query("opt_pretty", optPretty)
            .query("opt_fields", optFields)
            .query("limit", limit)
            .query("offset", offset);

        return req;
    }

    public CollectionRequest<PortfolioMembershipCompact> getPortfolioMemberships(String portfolio, String workspace, String user) throws IOException {
        return getPortfolioMemberships(portfolio, workspace, user, null, (int)Client.DEFAULTS.get("page_size"), null, false);
    }

    /**
     * Get memberships from a portfolio
     * Returns the compact portfolio membership records for the portfolio.
     * @param portfolioGid Globally unique identifier for the portfolio. (required)
     * @param user The user to filter results on. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#x27;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#x27; (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @return CollectionRequest<PortfolioMembershipCompact>
     * @throws IOException If we fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionRequest<PortfolioMembershipCompact> getPortfolioMembershipsForPortfolio(String portfolioGid, String user, String offset, Integer limit, List<String> optFields, Boolean optPretty) throws IOException {
        String path = "/portfolios/{portfolio_gid}/portfolio_memberships".replace("{portfolio_gid}", portfolioGid);

        CollectionRequest<PortfolioMembershipCompact> req = new CollectionRequest<PortfolioMembershipCompact>(this, PortfolioMembershipCompact.class, path, "GET")
            .query("user", user)
            .query("opt_pretty", optPretty)
            .query("opt_fields", optFields)
            .query("limit", limit)
            .query("offset", offset);

        return req;
    }

    public CollectionRequest<PortfolioMembershipCompact> getPortfolioMembershipsForPortfolio(String portfolioGid, String user) throws IOException {
        return getPortfolioMembershipsForPortfolio(portfolioGid, user, null, (int)Client.DEFAULTS.get("page_size"), null, false);
    }

}
