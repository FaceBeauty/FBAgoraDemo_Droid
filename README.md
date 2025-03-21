# API Example Android

*English | [中文](README.zh.md)*

# **FaceBeauty Integration Android Tutorial**
## **Instruction**
- This article introduces how to quickly configure FaceBeauty module.

<br/>

## **Steps**

### **1. Configuration**
After downloading, open project
- Replace **label** in AndroidManifest.xml and **applicationId** in build.gradle with **your APP name** and **package name**, respectively
- Replace **YOUR_APP_ID** with **your AppId** in Application
- Replace **assets** in fbui folder with your **assets**
- Build, Run, and search **init-status** to see relevant logs
- The specific execution steps can be viewed by searching **//todo --- facebeauty** globally

<br/>

This project presents you a set of API examples to help you understand how to use Agora APIs.

## Prerequisites

- Android Studio 3.0+
- Physical Android device
- Android simulator is supported

## Quick Start

This section shows you how to prepare, build, and run the sample application.

### Obtain an App Id

To build and run the sample application, get an App Id:

1. Create a developer account at [agora.io](https://dashboard.agora.io/signin/). Once you finish the signup process, you will be redirected to the Dashboard.
2. Navigate in the Dashboard tree on the left to **Projects** > **Project List**.
3. Save the **App Id** from the Dashboard for later use.
4. Save the **App Certificate** from the Dashboard for later use.

5. Open `Android/APIExample` and edit the `app/src/main/res/values/string-config.xml` file. Update `YOUR APP ID` with your App Id, update `YOUR APP CERTIFICATE` with the main app certificate from dashboard. Note you can leave the certificate variable `null` if your project has not turned on security token.

    ```
    // Agora APP ID.
    <string name="agora_app_id" translatable="false">YOUR APP ID</string>
    // Agora APP Certificate. If the project does not have certificates enabled, leave this field blank.
    <string name="agora_app_certificate" translatable="false">YOUR APP CERTIFICATE</string>
    ```

You are all set. Now connect your Android device and run the project.

### Beauty Configuration
This project contains third-party beauty integration examples, which are disabled by default. If you need to enable compilation and use, please refer to the corresponding configuration guide.



### For Agora Extension Developers

从4.0.0SDK开始，Agora SDK支持插件系统和开放的云市场帮助开发者发布自己的音视频插件，本项目包含了一个SimpleFilter示例，默认是禁用的状态，如果需要开启编译和使用需要完成以下步骤：
Since version 4.0.0, Agora SDK provides an Extension Interface Framework. Developers could publish their own video/audio extension to Agora Extension Market. In this project includes a sample SimpleFilter example, by default it is disabled.
In order to enable it, you could do as follows:

1. Download [opencv](https://agora-adc-artifacts.s3.cn-north-1.amazonaws.com.cn/androidLibs/opencv4.zip) library, unzip it and copy into Android/APIExample/agora-simple-filter/src/main/jniLibs
2. Download [Agora SDK包](https://download.agora.io/sdk/release/Agora_Native_SDK_for_Android_v4.1.0_FULL.zip), unzip it and copy c++ .so library (keeps arch folder) to Android/APIExample/agora-simple-filter/src/main/agoraLibs
3. Modify simpleFilter to true in Android/APIExample/gradle.properties

## Contact Us

- For potential issues, take a look at our [FAQ](https://docs.agora.io/en/faq) first
- Dive into [Agora SDK Samples](https://github.com/AgoraIO) to see more tutorials
- Take a look at [Agora Use Case](https://github.com/AgoraIO-usecase) for more complicated real use case
- Repositories managed by developer communities can be found at [Agora Community](https://github.com/AgoraIO-Community)
- You can find full API documentation at [Document Center](https://docs.agora.io/en/)
- If you encounter problems during integration, you can ask question in [Stack Overflow](https://stackoverflow.com/questions/tagged/agora.io)
- You can file bugs about this sample at [issue](https://github.com/AgoraIO/API-Examples/issues)

## License

The MIT License (MIT)
