package com.example.task_process_master_isha_nagar;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;

public class Constants {
    public static  String url="https://salestrip.blob.core.windows.net/tst-container/simpleWebsiteHTMLCSSJavaScricpt.zip";
    public static   String StorezipFileLocation = Environment.getExternalStorageDirectory() +                       "/DownloadedZip";
    public static   String DirectoryName= Environment.getExternalStorageDirectory() + "/unzipFolder/files/";
    public static final int MY_PERMISSIONS_REQUEST_WRITE_STORAGE = 123;
    public static boolean isConnectingToInternet(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
    }

}
