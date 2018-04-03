# ProcessingWearOS

A simple example of using Processing with Wear OS in Android Studio.

Learn more about Processing for Android [here](http://android.processing.org/index.html).

## Why?

Including the Processing library in an Android Studio project gives you a canvas to sketch on. You
can also take advantage of [Instant Run](https://developer.android.com/studio/run/index.html) this
way to see your updates in a Wear OS emulator in < 1 second (pushing code to a paired watch takes
a bit longer).

If you want to try something similar, but using Kotlin rather than Java, checkout
[this project](https://github.com/hathibelagal/ProcessingTutorial). It's for Android phones, but
could be adapted to work for Wear OS devices as well.

## How?

You can clone this repo, or if you want to start from a new Wear OS project, follow these steps:

1. Start a new Wear OS Android Studio project (use API 25 or newer).
2. Add the following to your gradle dependencies: org.p5android:processing-core:4.0.1
3. Add a styles.xml file to res/values/ and copy the contents from this repo.
4. Update android:theme in AndroidManifest.xml to: `android:theme="@style/AppTheme">`
5. Update activity_main.xml to match the same file in this repo.
6. Update the contents of MainActivity.java to match MainActivity.java in this repo (updating the
package name if necessary).
7. Copy Sketch.java from this repo (and update the package name if necessary).

You should now be able to build. Using the Emulator is recommended as you iterate because it's
super fast with Instant Run (hit the lightning bolt rather than the play button after your first
build).

*Tip: To get rid of the Toast that appears when using Instant Run, go to the Preferences
menu, search "Instant", then in the Instant Run settings, uncheck "Show toasts in the running app
when changes are applied".*

