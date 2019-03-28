package com.example.ari.saidata;

/**
 * Created by Ari on 1/15/2017.
 */

public class Koneksi {
    public static final String URL_GET_ALL = "http://probalam.com/probal_server/profil.php";


    //Keys that will be used to send the request to php scripts
    public static final String KEY_EMP_ID = "id_user";
    public static final String KEY_EMP_NAME = "nama_pengguna";
    public static final String KEY_EMP_LAT = "badg";
    public static final String KEY_EMP_LONGI= "like";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id_user";
    public static final String TAG_NAMA= "nama_pengguna";
    public static final String TAG_LAT= "badg";
    public static final String TAG_LONGI = "like";

    //employee id to pass with intent
    public static final String OSM_ID = "osm_id";

}
