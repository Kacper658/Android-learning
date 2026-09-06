# Android-learning 🚗⛽

My first Android app — a simple **fuel consumption calculator**.

> **How much fuel?** — Enter your vehicle's fuel usage (l/100 km) and the distance (km),
> and the app calculates how many liters of fuel you'll need.

## Features

- ⛽ Calculates fuel needed for a trip: `liters = usage / 100 × distance`
- ✅ Input validation with error messages
- 🌍 Two languages: English + Polish (`values` / `values-b+pl`)
- 🎨 Custom styles and colors (`style.xml`, `colors.xml`)

## Tech stack

- **Language:** Java
- **UI:** XML layouts with `ConstraintLayout`
- **Platform:** Android SDK (target API 31), AppCompat
- **IDE:** Android Studio

## Project structure

```
├── AndroidManifest.xml
├── java/com/company/anapp/
│   └── MainActivity.java        # main logic: calculation + validation
├── res/
│   ├── layout/
│   │   └── activity_main.xml    # main screen layout
│   ├── values/                  # strings, colors, styles, themes (EN)
│   ├── values-b+pl/             # Polish translation
│   └── drawable/ mipmap/ ...    # graphics and launcher icons
└── icon preview/                # draft app icon
```

## How to run

1. Clone the repository:
   ```bash
   git clone https://github.com/Kacper658/Android-learning.git
   ```
2. Open the project in **Android Studio**.
3. Let Gradle sync, then run on an emulator or a physical device
   (`Run ▶` or `Shift + F10`).

> ⚠️ Note: this repo contains only the app sources (`java/`, `res/`,
> `AndroidManifest.xml`) without Gradle wrapper files. If Android Studio
> doesn't detect the project, create a new *Empty Views Activity* project
> and copy these folders into it.

## Usage

1. Enter **fuel usage** in l/100 km.
2. Enter **distance** in kilometers.
3. Tap **Count** to see the result in liters.

## Changelog

- **v0.5** — Fixed layout, moved hardcoded colors to `colors.xml`
- **v0.4** — Eye-friendly text colors, styles moved to a separate file, bug fixes
- **v0.3** — Bug fixes
- **v0.2** — Added usage for the app
- **v0.1** — First version 🎉

## Author

**[Kacper658](https://github.com/Kacper658)** — learning Android development.
