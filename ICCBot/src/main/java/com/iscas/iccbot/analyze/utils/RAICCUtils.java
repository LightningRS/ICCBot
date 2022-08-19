package com.iscas.iccbot.analyze.utils;

import soot.Unit;

import java.util.HashSet;
import java.util.Set;

public class RAICCUtils {

    public static boolean isIntentSenderCreation(Unit unit) {
        return unit.toString().contains(RAICCConstants.ANDROID_APP_PENDING_INTENT_GET_INTENTSENDER);
    }

    public static boolean isPendingIntentCreation(Unit unit) {
        String sig = unit.toString();
        if (sig.contains(RAICCConstants.ANDROID_APP_PENDING_INTENT_GET_ACTIVITY)
                || sig.contains(RAICCConstants.ANDROID_APP_PENDING_INTENT_GET_BROADCAST)
                || sig.contains(RAICCConstants.ANDROID_APP_PENDING_INTENT_GET_SERVICE)) {
            return true;
        }
        return false;
    }

    public static boolean isWrapperMethods(Unit u) {
        for (String s : getWrapperMethods()) {
            if (u.toString().contains(s))
                return true;
        }
        return false;
    }

    public static Set<String> getWrapperMethods() {
        Set<String> methods = new HashSet<String>();
        methods.add(RAICCConstants.ANDROID_APP_ACTIVITYOPTIONS_REQUESTUSAGETIMEREPORT);
        methods.add(RAICCConstants.ANDROID_APP_ALARMMANAGER_SETALARMCLOCK);
        methods.add(RAICCConstants.ANDROID_APP_ALARMMANAGER_SETANDALLOWWHILEIDLE);
        methods.add(RAICCConstants.ANDROID_APP_ALARMMANAGER_SETEXACTANDALLOWWHILEIDLE);
        methods.add(RAICCConstants.ANDROID_APP_ALARMMANAGER_SETEXACT);
        methods.add(RAICCConstants.ANDROID_APP_ALARMMANAGER_SETINEXACTREPEATING);
        methods.add(RAICCConstants.ANDROID_APP_ALARMMANAGER_SET);
        methods.add(RAICCConstants.ANDROID_APP_ALARMMANAGER_SETREPEATING);
        methods.add(RAICCConstants.ANDROID_APP_ALARMMANAGER_SETWINDOW);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$ACTION$BUILDER_1);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$ACTION$BUILDER_2);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$BUBBLEMETADATA$BUILDER_SETDELETEINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$BUBBLEMETADATA$BUILDER_SETINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$BUILDER_ADDACTION);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$BUILDER_SETDELETEINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$BUILDER_SETFULLSCREENINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$CAREXTENDER$BUILDER_SETREADPENDINGINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$CAREXTENDER$BUILDER_SETREPLYACTION);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$WEARABLEEXTENDER_SETDISPLAYINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATIONCOMPAT$ACTION$BUILDER_1);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATIONCOMPAT$ACTION$BUILDER_2);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATIONCOMPAT$BUBBLEMETADATA$BUILDER_SETDELETEINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATIONCOMPAT$BUBBLEMETADATA$BUILDER_SETINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATIONCOMPAT$BUILDER_ADDACTION);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATIONCOMPAT$BUILDER_SETCONTENTINTENT1);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATIONCOMPAT$BUILDER_SETCONTENTINTENT2);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATIONCOMPAT$BUILDER_SETDELETEINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATIONCOMPAT$BUILDER_SETFULLSCREENINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$CAREXTENDER$BUILDER_SETREADPENDINGINTENT);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$CAREXTENDER$BUILDER_SETREPLYACTION);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION$WEARABLEEXTENDER_SETDISPLAYINTENT);
        methods.add(RAICCConstants.ANDROID_APP_SLICE_SLICE$BUILDER_ADDACTION);
        methods.add(RAICCConstants.ANDROID_BLUETOOTH_LE_BLUETOOTHLESCANNER_STARTSCAN);
        methods.add(RAICCConstants.ANDROID_LOCATION_LOCATIONMANAGER_ADDPROXIMITYALERT);
        methods.add(RAICCConstants.ANDROID_LOCATION_LOCATIONMANAGER_REQUESTLOCATIONUPDATES_1);
        methods.add(RAICCConstants.ANDROID_LOCATION_LOCATIONMANAGER_REQUESTLOCATIONUPDATES_2);
        methods.add(RAICCConstants.ANDROID_LOCATION_LOCATIONMANAGER_REQUESTSINGLEUPDATE_1);
        methods.add(RAICCConstants.ANDROID_LOCATION_LOCATIONMANAGER_REQUESTSINGLEUPDATE_2);
        methods.add(RAICCConstants.ANDROID_MEDIA_AUDIOMANAGER_REGISTERMEDIABUTTONEVENTRECEIVER);
        methods.add(RAICCConstants.ANDROID_MEDIA_SESSION_MEDIASESSION_SETMEDIABUTTONRECEIVER);
        methods.add(RAICCConstants.ANDROID_MEDIA_SESSION_MEDIASESSION_SETSESSIONACTIVITY);
        methods.add(RAICCConstants.ANDROID_NET_CONNECTIVITYMANAGER_REGISTERNETWORKCALLBACK);
        methods.add(RAICCConstants.ANDROID_NET_CONNECTIVITYMANAGER_REQUESTNETWORK);
        methods.add(RAICCConstants.ANDROID_NET_SIP_SIPMANAGER_OPEN);
        methods.add(RAICCConstants.ANDROID_NET_VPNSERVICE_BUILDER_SETCONFIGUREINTENT);
        methods.add(RAICCConstants.ANDROID_NFC_NFCADAPTER_ENABLEFOREGROUNDDISPATCH);
        methods.add(RAICCConstants.ANDROID_PRINT_PRINTERINFO_BUILDER_SETINFOINTENT);
        methods.add(RAICCConstants.ANDROID_SUPPORT_V4_APP_ACTIVITYOPTIONSCOMPAT_REQUESTUSAGETIMEREPORT);
        methods.add(RAICCConstants.ANDROID_SUPPORT_V4_APP_NOTIFICATIONCOMPAT$ACTION$BUILDER_1);
        methods.add(RAICCConstants.ANDROID_SUPPORT_V4_APP_NOTIFICATIONCOMPAT$ACTION_1);
        methods.add(RAICCConstants.ANDROID_SUPPORT_V4_APP_NOTIFICATIONCOMPAT$BUILDER_ADDACTION);
        methods.add(RAICCConstants.ANDROID_SUPPORT_V4_APP_NOTIFICATIONCOMPAT$BUILDER_SETFULLSCREENINTENT);
        methods.add(RAICCConstants.ANDROID_SUPPORT_V4_MEDIA_APP_NOTIFICATIONCOMPAT$MEDIASTYLE_SETCANCELBUTTONINTENT);
        methods.add(RAICCConstants.ANDROID_SUPPORT_V4_MEDIA_SESSION_MEDIASESSIONCOMPAT_SETMEDIABUTTONRECEIVER);
        methods.add(RAICCConstants.ANDROID_SUPPORT_V4_MEDIA_SESSION_MEDIASESSIONCOMPAT_SETSESSIONACTIVITY);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_EUICC_EUICCMANAGER_DOWNLOADSUBSCRIPTION);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_EUICC_EUICCMANAGER_STARTRESOLUTIONACTIVITY);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_EUICC_EUICCMANAGER_SWITCHTOSUBSCRIPTION);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_EUICC_EUICCMANAGER_UPDATESUBSCRIPTIONNICKNAME);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_SMSMANAGER_CREATEAPPSPECIFICSMSTOKENWITHPACKAGEINFO);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_SMSMANAGER_DOWNLOADMULTIMEDIAMESSAGE);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_SMSMANAGER_INJECTSMSPDU);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_SMSMANAGER_SENDDATAMESSAGE);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_SMSMANAGER_SENDMULTIMEDIAMESSAGE);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_SMSMANAGER_SENDTEXTMESSAGE_1);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_SMSMANAGER_SENDTEXTMESSAGE_2);
        methods.add(RAICCConstants.ANDROID_TELEPHONY_SMSMANAGER_SENDTEXTMESSAGEWITHOUTPERSISTING);
        methods.add(RAICCConstants.ANDROID_WIDGET_REMOTEVIEWS_SETONCLICKPENDINGINTENT);
        methods.add(RAICCConstants.ANDROID_WIDGET_REMOTEVIEWS_SETREMOTEADAPTER);
        methods.add(RAICCConstants.ANDROID_WIDGET_REMOTEVIEWS_SETPENDINGINTENTTEMPLATE);
        methods.add(RAICCConstants.ANDROIDX_BROWSER_BROWSERACTIONS_BROWSERACTIONITEM);
        methods.add(RAICCConstants.ANDROIDX_BROWSER_BROWSERACTIONS_BROWSERACTIONSINTENT$BUILDER_SETONITEMSELECTEDACTION);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_ALARMMANAGERCOMPAT_SETEXACT);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$ACTION$BUILDER_1);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$ACTION$BUILDER_2);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$ACTION$BUILDER_3);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$ACTION$BUILDER_4);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$ACTION_1);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$ACTION_2);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$ACTION_3);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$ACTION_4);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$BUBBLEMETADATA$BUILDER_SETDELETEINTENT);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$BUBBLEMETADATA$BUILDER_SETINTENT);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$BUBBLEMETADATA_1);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$BUBBLEMETADATA_2);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$BUILDER_ADDACTION);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$CAREXTENDER$UNREADCONVERSATION);
        methods.add(RAICCConstants.ANDROID_APP_NOTIFICATION_SETLATESTEVENTINFO);
        methods.add(RAICCConstants.COM_GOOGLE_ANDROID_GMS_LOCATION_ACTIVITYRECOGNITIONAPI_REQUESTACTIVITYUPDATES);
        methods.add(RAICCConstants.COM_GOOGLE_ANDROID_GMS_LOCATION_FUSEDLOCATIONPROVIDERAPI_REQUESTLOCATIONUPDATES);
        methods.add(RAICCConstants.COM_GOOGLE_ANDROID_GMS_LOCATION_FUSEDLOCATIONPROVIDERCLIENT_REQUESTLOCATIONUPDATES);
        methods.add(RAICCConstants.COM_GOOGLE_ANDROID_GMS_LOCATION_GEOFENCINGAPI_ADDGEOFENCES);
        methods.add(RAICCConstants.COM_GOOGLE_ANDROID_GMS_LOCATION_LOCATIONCLIENT_ADDGEOFENCES);
        methods.add(RAICCConstants.COM_GOOGLE_ANDROID_VENDING_EXPANSION_DOWNLOADER_DOWNLOADERCLIENTMARSHALLER_STARTDOWNLOADSERVICEIFREQUIRED);
        methods.add(RAICCConstants.COM_GOOGLE_VR_NDK_BASE_DAYDREAMAPI_LAUNCHINVR);
        methods.add(RAICCConstants.COM_GOOGLE_VR_NDK_BASE_DAYDREAMAPI_LAUNCHINVRFORRESULT);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$BUILDER_SETCONTENTINTENT);
        methods.add(RAICCConstants.ANDROIDX_CORE_APP_NOTIFICATIONCOMPAT$BUILDER_SETDELETEINTENT);
        methods.add(RAICCConstants.ANDROID_CONTENT_PM_PACKAGEINSTALLER$SESSION_COMMIT);
        methods.add(RAICCConstants.ANDROID_CONTENT_PM_PACKAGEINSTALLER_INSTALLEXISTINGPACKAGE);
        methods.add(RAICCConstants.ANDROID_COMPANION_COMPANIONDEVICEMANAGER$CALLBACK_ONDEVICEFOUND);
        methods.add(RAICCConstants.ANDROID_CONTENT_INTENTSENDER$ONFINISHED_ONSENDFINISHED);
        methods.add(RAICCConstants.ANDROID_APP_FRAGMENTHOSTCALLBACK_ONSTARTINTENTSENDERFROMFRAGMENT);
        methods.add(RAICCConstants.ANDROID_SERVICE_AUTOFILL_SAVECALLBACK_ONSUCCESS);
        methods.add(RAICCConstants.ANDROIDX_CORE_CONTENT_PM_SHORTCUTMANAGERCOMPAT_REQUESTPINSHORTCUT);
        methods.add(RAICCConstants.ANDROID_SERVICE_AUTOFILL_FILLRESPONSE$BUILDER_SETAUTHENTICATION_1);
        methods.add(RAICCConstants.ANDROID_SERVICE_AUTOFILL_FILLRESPONSE$BUILDER_SETAUTHENTICATION_2);
        methods.add(RAICCConstants.ANDROID_CONTENT_CONTEXT_STARTINTENTSENDER_1);
        methods.add(RAICCConstants.ANDROID_CONTENT_CONTEXT_STARTINTENTSENDER_2);
        methods.add(RAICCConstants.ANDROID_APP_ACTIVITY_STARTINTENTSENDERFORRESULT_1);
        methods.add(RAICCConstants.ANDROID_APP_ACTIVITY_STARTINTENTSENDERFORRESULT_2);
        methods.add(RAICCConstants.START_INTENTSENDER_FOR_RESULT_1);
        methods.add(RAICCConstants.START_INTENTSENDER_FOR_RESULT_2);

        methods.add(RAICCConstants.ANDROID_APP_ACTIVITY_STARTINTENTSENDERFROMCHILD_1);
        methods.add(RAICCConstants.ANDROID_APP_ACTIVITY_STARTINTENTSENDERFROMCHILD_2);
        methods.add(RAICCConstants.ANDROID_CONTENT_PM_PACKAGEINSTALLER_UNINSTALL_1);
        methods.add(RAICCConstants.ANDROID_CONTENT_PM_PACKAGEINSTALLER_UNINSTALL_2);
        methods.add(RAICCConstants.ANDROID_APP_PENDINGINTENT_SEND_1);
        methods.add(RAICCConstants.ANDROID_APP_PENDINGINTENT_SEND_2);
        methods.add(RAICCConstants.ANDROID_APP_PENDINGINTENT_SEND_3);
        methods.add(RAICCConstants.ANDROID_APP_PENDINGINTENT_SEND_4);
        methods.add(RAICCConstants.ANDROID_APP_PENDINGINTENT_SEND_5);
        methods.add(RAICCConstants.ANDROID_APP_PENDINGINTENT_SEND_6);
        methods.add(RAICCConstants.ANDROID_APP_PENDINGINTENT_SEND_7);
        methods.add(RAICCConstants.ANDROID_CONTENT_INTENTSENDER_SENDINTENT_1);
        methods.add(RAICCConstants.ANDROID_CONTENT_INTENTSENDER_SENDINTENT_2);

        methods.add(RAICCConstants.ANDROID_queryBroadcastReceivers);
        methods.add(RAICCConstants.ANDROID_queryIntentActivities);
        methods.add(RAICCConstants.ANDROID_queryIntentServices);

        return methods;

    }
}
