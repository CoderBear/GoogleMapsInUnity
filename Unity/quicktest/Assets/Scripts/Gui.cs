using UnityEngine;
using System.Collections;

public class Gui : MonoBehaviour 
{

    public static AndroidJavaClass ViewJavaClass;



	// Use this for initialization
	void Start () 
    {
        if (Application.platform == RuntimePlatform.Android)
        {
            // Initialize Android View
            ViewJavaClass = new AndroidJavaClass("my.android.game.ViewActivityUnity");

            //AndroidJavaClass mapsclass = new AndroidJavaClass("com.google.android.gms.maps.MapFragment");
            //mapsclass.CallStatic("newInstance");
        }
	
	}
	
	// Update is called once per frame
	void Update () {
	
	}

    void OnGUI()
    {
        
        if (Application.platform == RuntimePlatform.Android)
        {
            if (GUI.Button(new Rect(10, 300, 150, 120), "Show android Screen"))
            {
                AndroidJavaClass unityPlayer = new AndroidJavaClass("com.unity3d.player.UnityPlayer");
                AndroidJavaObject activity = unityPlayer.GetStatic<AndroidJavaObject>("currentActivity");
                activity.Call("showAndroidView");
                
                
                //ViewJavaClass.CallStatic("showAndroidView");
            }
        }
        else
        {
            if (GUI.Button(new Rect(10, 300, 150, 120), "Show non-android Screen"))
            {

            }
        }
    }
}
