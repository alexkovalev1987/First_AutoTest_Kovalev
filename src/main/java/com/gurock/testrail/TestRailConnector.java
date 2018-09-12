package com.gurock.testrail;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestRailConnector {

    private JSONObject r;
    private APIClient client;
    private Map testResultData = new HashMap();

    public TestRailConnector() {
    }

    public TestRailConnector(String testRailPage, String testRailUser, String testRailPassword) {
        client = new APIClient(testRailPage);
        client.setUser(testRailUser);
        client.setPassword(testRailPassword);
    }
    public void sendTestResult (String testCasedId, int statusId, String comment, long elapsedTime,
                                String testRailRunId){
        testResultData.put("status_id", statusId);
        testResultData.put("comment", comment);

        if (elapsedTime>0) {
            testResultData.put("elapsed", elapsedTime);

            System.out.println("Using URL: " + "add_result_for_case/" + testRailRunId + "/" + testCasedId);

            try {
                r = (JSONObject) client.sendPost("add_result_for_case/" + testRailRunId + "/" + testCasedId, testResultData);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (APIException e) {
                e.printStackTrace();
            }
        }
    }
}
