# Raftaar Mart (रफ़्तार मार्ट) - Complete Android Project

This is the complete, production-ready Android Studio project for **Raftaar Mart (रफ़्तार मार्ट)**.

## 🚀 Key Features in this Android Project
1. **100% Offline-Ready Asset Bundling**: The entire optimized Single Page Application is bundled under `app/src/main/assets/www/` for instant zero-latency loading on mobile networks.
2. **Native UPI Deep-Link Integration**: Direct intent intercept for `upi://pay` links that automatically launches PhonePe, Google Pay, Paytm, or BHIM.
3. **Native WhatsApp Backup Interceptor**: Detects `wa.me` links and launches WhatsApp directly to share orders with the store owner or send automated customer status updates.
4. **Camera & Gallery Image Picker**: Seamless file chooser support for customers uploading payment screenshots or UTR receipts.
5. **Hardware Back Button Handling**: Native Android navigation stack integration with hardware back key support.
6. **Pull-to-Refresh**: Native Android `SwipeRefreshLayout` support with custom emerald & saffron brand progress bars.
7. **Native WebAppInterface Bridge**: Supports device vibration feedback and native toast notifications.

---

## 🛠️ How to Open and Run in Android Studio

1. **Prerequisites**:
   - Download and install [Android Studio](https://developer.android.com/studio) (Hedgehog, Iguana, Koala, or Ladybug).
   - JDK 17 or higher (bundled with Android Studio).

2. **Open the Project**:
   - Launch Android Studio.
   - Select **Open** (or `File -> Open`).
   - Navigate to the extracted folder: `RaftaarMart-Android`.
   - Click **OK**. Android Studio will automatically sync the Gradle files and download dependencies.

3. **Run on an Emulator or Real Device**:
   - Enable **USB Debugging** on your Android phone, or start an Android Virtual Device (AVD).
   - Click the green **Run (▶)** button in Android Studio (or press `Shift + F10`).
   - The app will install and open instantly as `Raftaar Mart`.

4. **Generate Signed APK or Android App Bundle (AAB)**:
   - In Android Studio menu: `Build -> Generate Signed Bundle / APK...`
   - Select **Android App Bundle** (for Google Play Store) or **APK** (for direct device installation).
   - Create or select your keystore and click **Finish**.

---

## 📦 Project Structure Overview
- `app/src/main/java/com/raftaarmart/app/`
  - `MainActivity.kt`: Main WebView activity with native intents for UPI, WhatsApp, dialer, and file chooser.
  - `WebAppInterface.kt`: JavascriptInterface bridge for native hardware capabilities.
  - `RaftaarMartApplication.kt`: Application class.
- `app/src/main/assets/www/`: Bundled web application distribution (HTML, JS, CSS, fonts).
- `app/src/main/res/`: Colors, strings, vector adaptive icons, and layout files.
- `app/build.gradle.kts`: Gradle module configuration (Target SDK 34, Min SDK 24).
