# Heartrate-Reader-WearOS

This is a Kotlin application for Wearable and Android phone to establish communication with each other using Services and the Wearable MessageApi to communicate between devices. Sensor Manager is used to read the heart rate data from watch.

# Usage
1. Download and Install Android Studio from https://developer.android.com/studio 
2. Clone the project repository
3. Import the project in Android Studio
4. Build the project

# Initial Setup - Watch and Android Phone

Follow instructions from https://support.google.com/wearos/answer/6056630?hl=en&co=GENIE.Platform%3DAndroid to set up the watch and phone

# Steps to install Wearable application on real Wear OS Watch device

1. Switch on Developer Options on phone and watch by :
   Settings -> About -> Click on "Build Number" multiple until a prompt is seen that Developer Options is enabled.
2. Go to Developer Options on both phone and watch and Turn on ADB Debugging
3. On Watch : Enable "Debug over Bluetooth" under Developer Options
4. On Phone : Open Wear OS app. Navigate to Advanced Settings and Enable Debugging over Bluetooth. This will now show 
              Host : Disconnected
              Target : Connected
              Here, the host is the PC that the phone should further be connected to.
              Target is the Wear OS watch device.
5. Connect phone to PC using USB cable.
6. Open Command Prompt and enter the commands: 
      i) adb forward tcp:4444 localabstract:/adb-hub
      ii) adb connect 127.0.0.1:4444
      Note : You must use the IP address 127.0.0.1. Use any available port on your development machine, and use the same port in both commands. In this example,                the port is 4444.
7. After you enter the connect command, the watch asks you to confirm that you are allowing ADB Debugging.
8. On the phone, check the status display in the Wear OS companion app for the following:
   Host: connected
   Target: connected
9. Open Android Studio project and select the "Wearable" configuration and from list of Available Devices, select your Watch device.
10. Click on "Run App" button. The Wearable app called "Runtime Permissions" will be installed in the Watch and will launch in a couple of minutes. 

# Steps to install application on real Android phone

1. After installation of Wearable application, keep the phone connected to PC.
2. In Android Studio, now change the configuration to "Application" and from list of Available Devices, select your Android phone device.
3. Click on "Run App" button. The Wearable app called "Runtime Permissions" will be installed in the phone and will launch in a couple of minutes.

# Using Application to read heart rate data

1. Start the mobile or wear app. Each app contains two buttons: one for showing local data and another for showing remote data.
2. Click either button to view the data. Both local and remote data require permissions to be approved before displaying the data for devices running 23 or above.    You will be asked to approve the access if you do not have the proper permissions.
3. The happy icon signifies you have access to the data while the sad icon signifies you do or may not have access (and may be asked to approve access).
4. As and when the buttons are clicked, the data is read from phone/watch and displayed on the device.

# Application flow

##FLOW OF PERMISSIONS FROM WATCH TO PHONE AND VICE VERSA 
<img src="screenshots/watch2ph.png" height="400" alt="Flow of permissions from watch to phone"/> <img src="screenshots/ph2watchh.png" height="400" alt="Flow of permissions from phone to watch"/> 
