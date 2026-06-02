# 閿佸睆鏃堕挓 (LockScreenClock)

瀹夊崜閿佸睆鏃堕挓搴旂敤锛屽彲鍦ㄩ攣灞忕姸鎬佷笅鏄剧ず鏃堕棿锛堝皬鏃?鍒嗛挓:绉掞級銆?
## 鍔熻兘鐗圭偣

- **瀹炴椂鏃堕挓鏄剧ず**: 鍦ㄩ攣灞忕晫闈㈡樉绀哄綋鍓嶆椂闂达紙HH:mm:ss 鏍煎紡锛?- **鏃ユ湡鏄剧ず**: 鍚屾椂鏄剧ず褰撳墠鏃ユ湡
- **澶у瓧浣撹璁?*: 渚夸簬鍦ㄩ攣灞忕姸鎬佷笅鏌ョ湅
- **榛戣壊鑳屾櫙**: 鐪佺數涓旀姢鐪?
## 椤圭洰缁撴瀯

```
LockScreenClock/
鈹溾攢鈹€ app/
鈹?  鈹溾攢鈹€ src/main/
鈹?  鈹?  鈹溾攢鈹€ java/com/example/lockscreenclock/
鈹?  鈹?  鈹?  鈹斺攢鈹€ MainActivity.kt      # 涓荤晫闈?鈹?  鈹?  鈹溾攢鈹€ res/
鈹?  鈹?  鈹?  鈹溾攢鈹€ layout/            # 甯冨眬鏂囦欢
鈹?  鈹?  鈹?  鈹溾攢鈹€ values/           # 棰滆壊銆佸瓧绗︿覆
鈹?  鈹?  鈹?  鈹斺攢鈹€ drawable/         # 鍥炬爣
鈹?  鈹?  鈹斺攢鈹€ AndroidManifest.xml   # 搴旂敤娓呭崟
鈹?  鈹斺攢鈹€ build.gradle             # 妯″潡鏋勫缓閰嶇疆
鈹溾攢鈹€ build.gradle                 # 椤圭洰鏋勫缓閰嶇疆
鈹溾攢鈹€ settings.gradle             # 椤圭洰璁剧疆
鈹斺攢鈹€ gradle.properties         # Gradle灞炴€?```

## 鏋勫缓璇存槑

### 鏂瑰紡涓€锛氫娇鐢ㄥ湪绾挎瀯寤烘湇鍔★紙鎺ㄨ崘锛?
鐢变簬褰撳墠鐜缂哄皯 Gradle 宸ュ叿锛屽缓璁娇鐢ㄤ互涓嬪湪绾挎湇鍔℃瀯寤猴細

1. **GitHub Actions (鍏嶈垂)**
   - 灏嗛」鐩笂浼犲埌 GitHub
   - 寮€鍚?Actions 鑷姩鏋勫缓
   - 涓嬭浇鐢熸垚鐨?APK

2. **Appetize.io / Shader.io**
   - 鍦ㄧ嚎缂栬瘧 Android 椤圭洰

3. **鏈湴鐢佃剳瀹夎**
   - 瀹夎 Android Studio
   - 瀵煎叆椤圭洰锛岀偣鍑?Build APK

### 鏂瑰紡浜岋細鎵嬪姩瀹夎 Gradle锛堥渶瑕佺綉缁滐級

```batch
:: 1. 瀹夎 JDK 17
winget install Oracle.JDK.17

:: 2. 涓嬭浇 Gradle
curl -L -o gradle.zip https://services.gradle.org/distributions/gradle-8.5-bin.zip

:: 3. 瑙ｅ帇骞舵坊鍔犲埌 PATH
:: 4. 鏋勫缓
gradle assembleDebug
```

### 鏂瑰紡涓夛細浣跨敤 Android Studio锛堟帹鑽愶級

1. 涓嬭浇骞跺畨瑁?[Android Studio Bumblebee+](https://developer.android.com/studio)
2. 鎵撳紑椤圭洰
3. 鐐瑰嚮 **Build 鈫?Build APK**
4. APK 浣嶄簬 `app/build/outputs/apk/debug/app-debug.apk`

## APK 杈撳嚭浣嶇疆

鏋勫缓鎴愬姛鍚庯紝APK 鏂囦欢浣嶄簬锛?- Debug: `app/build/outputs/apk/debug/app-debug.apk`
- Release: `app/build/outputs/apk/release/app-release.apk`

## 浣跨敤鏂规硶

1. 灏?APK 瀹夎鍒板畨鍗撴墜鏈?骞虫澘
2. 鎵撳紑搴旂敤
3. 鎺堜簣"鏄剧ず鍦ㄥ叾浠栧簲鐢ㄤ箣涓?鏉冮檺
4. 灏嗗簲鐢ㄩ攣瀹氬湪鍚庡彴杩愯
5. 鎸夌數婧愰敭鏌ョ湅閿佸睆鏃堕挓鏁堟灉

## 鎶€鏈爤

- Kotlin
- Android SDK 34
- Gradle 8.5
- AndroidX

---
鐢熸垚鏃堕棿: 2026-06-02