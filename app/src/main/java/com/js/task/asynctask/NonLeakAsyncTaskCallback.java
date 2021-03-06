package com.js.task.asynctask;

abstract class NonLeakAsyncTaskCallback<Params, Progress, Result> implements INonLeakAsyncTaskCallback<Params, Result> {
    public void onPreExecute() {}
    public void onPostExecute(Result result) {}
    public void onProgressUpdate(Progress[] progresses) {}
}