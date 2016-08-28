package com.cap.data.net;

import java.util.concurrent.Callable;

/**
 * Created by CAP on 13/08/2016.
 *
 */
public interface ApiConnection extends Callable<RestApi>{

    @Override
    RestApi call() throws Exception;

    RestApi requestSyncCall();
}
