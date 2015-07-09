package ch.swissonid.design_lib_sample.network.rest;

import ch.swissonid.design_lib_sample.utils.Consts;
import retrovolley.annotation.Endpoint;
import retrovolley.annotation.GET;

/**
 * Created by soleinicenco on 7/9/15.
 */
public enum GitHubCalls {

    @GET("/")
    @Endpoint(Consts.GITHUB_ENDPOINT)
    ROOT
}
