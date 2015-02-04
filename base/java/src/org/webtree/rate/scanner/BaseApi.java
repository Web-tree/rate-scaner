package org.webtree.rate.scanner;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
public class BaseApi {
    public String httpRequest(HttpMethod method, String url) throws IOException {
        return httpRequest(method, url, Collections.emptyMap());
    }

    public String httpRequest(HttpMethod method, String url, Map<String, Object> params) throws IOException {
        switch (method) {
            case GET:
                url += buildGetParams(params);
                break;
            default:
                throw new IllegalArgumentException("Method " + method + " is not supported");
        }
        return IOUtils.toString(new URL(url).openStream());
    }

    protected String buildGetParams(Map<String, Object> params) {
        if (params.isEmpty()) {
            return "";
        }
        StringBuilder resultParams = new StringBuilder("?");
        params.forEach((name, value) -> {
            resultParams.append(name).append("=").append(value).append("&");
        });
        return resultParams.toString().substring(0, resultParams.length() - 1);
    }

    public static enum HttpMethod {
        GET, POST, PUT, DELETE
    }
}
