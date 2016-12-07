package com.example.weker.camera_stream;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class UploadService extends IntentService {

    private static final String S_TAG = "UploadService";

    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "com.example.weker.camera_stream.action.FOO";
    private static final String ACTION_BAZ = "com.example.weker.camera_stream.action.BAZ";

    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "com.example.weker.camera_stream.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.example.weker.camera_stream.extra.PARAM2";

    public UploadService() {
        super("UploadService");
    }

    private static void zzz(int duration) throws InterruptedException {
        Log.d(S_TAG, String.format("Sleeping for [%d] ms ...", duration));
        Thread.sleep(duration);
        Log.d(S_TAG, String.format("Sleeping for [%d] ms ... done", duration));
    }

    private static boolean timeoutExpired(long startTime, int timeoutSeconds) {
        long currTime = System.currentTimeMillis();
        long elapsed = currTime - startTime;
        if (elapsed >= timeoutSeconds * 1000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void onHandleIntent(Intent intent) {
//        Uri fileUri = intent.getData();
//        String chosenAccountName = intent.getStringExtra(MainActivity.ACCOUNT_KEY);
//
//        credential =
//                GoogleAccountCredential.usingOAuth2(getApplicationContext(), Lists.newArrayList(Auth.SCOPES));
//        credential.setSelectedAccountName(chosenAccountName);
//        credential.setBackOff(new ExponentialBackOff());
//
//        String appName = getResources().getString(R.string.app_name);
//        final YouTube youtube =
//                new YouTube.Builder(transport, jsonFactory, credential).setApplicationName(
//                        appName).build();
//
//
//        try {
//            tryUploadAndShowSelectableNotification(fileUri, youtube);
//        } catch (InterruptedException e) {
//            // ignore
//        }
    }

//    private void tryUploadAndShowSelectableNotification(final Uri fileUri, final YouTube youtube) throws InterruptedException {
////        while (true) {
////            Log.i(TAG, String.format("Uploading [%s] to YouTube", fileUri.toString()));
////            String videoId = tryUpload(fileUri, youtube);
////            if (videoId != null) {
////                Log.i(TAG, String.format("Uploaded video with ID: %s", videoId));
////                tryShowSelectableNotification(videoId, youtube);
////                return;
////            } else {
////                Log.e(TAG, String.format("Failed to upload %s", fileUri.toString()));
////                if (mUploadAttemptCount++ < MAX_RETRY) {
////                    Log.i(TAG, String.format("Will retry to upload the video ([%d] out of [%d] reattempts)",
////                            mUploadAttemptCount, MAX_RETRY));
////                    zzz(UPLOAD_REATTEMPT_DELAY_SEC * 1000);
////                } else {
////                    Log.e(TAG, String.format("Giving up on trying to upload %s after %d attempts",
////                            fileUri.toString(), mUploadAttemptCount));
////                    return;
////                }
////            }
////        }
//    }

//    private void tryShowSelectableNotification(final String videoId, final YouTube youtube)
//            throws InterruptedException {
////        mStartTime = System.currentTimeMillis();
////        boolean processed = false;
////        while (!processed) {
////            processed = ResumableUpload.checkIfProcessed(videoId, youtube);
////            if (!processed) {
////                // wait a while
////                Log.d(TAG, String.format("Video [%s] is not processed yet, will retry after [%d] seconds",
////                        videoId, PROCESSING_POLL_INTERVAL_SEC));
////                if (!timeoutExpired(mStartTime, PROCESSING_TIMEOUT_SEC)) {
////                    zzz(PROCESSING_POLL_INTERVAL_SEC * 1000);
////                } else {
////                    Log.d(TAG, String.format("Bailing out polling for processing status after [%d] seconds",
////                            PROCESSING_TIMEOUT_SEC));
////                    return;
////                }
////            } else {
////                ResumableUpload.showSelectableNotification(videoId, getApplicationContext());
////                return;
////            }
////        }
//    }
//
//    private String tryUpload(Uri mFileUri, YouTube youtube) {
//        long fileSize;
//        InputStream fileInputStream = null;
//        String videoId = null;
//        try {
//            fileSize = getContentResolver().openFileDescriptor(mFileUri, "r").getStatSize();
//            fileInputStream = getContentResolver().openInputStream(mFileUri);
//            String[] proj = {MediaStore.Images.Media.DATA};
//            Cursor cursor = getContentResolver().query(mFileUri, proj, null, null, null);
//            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
//            cursor.moveToFirst();
//
//            videoId = ResumableUpload.upload(youtube, fileInputStream, fileSize, mFileUri, cursor.getString(column_index), getApplicationContext());
//
//
//        } catch (FileNotFoundException e) {
//            Log.e(getApplicationContext().toString(), e.getMessage());
//        } finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException e) {
//                // ignore
//            }
//        }
//        return videoId;
//    }
//
//}
}
