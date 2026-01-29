<div style="text-align: center;">
  <img src="screenshots/combined/top_banner.png">

## About
</div>

**_DayLighter_** is a Material 3 themed android app for tracking **dusk/dawn phases** as well as **golden/blue hours**.

<details>
    <summary>Table of Contents</summary>
    <ol>
        <li><a href="#screenshots">Screenshots</a></li>
        <li><a href="#features">Features</a></li>
        <li><a href="#used-technologies">Used technologies</a></li>
    </ol>
</details>

## Screenshots

<p style="text-align: center; width: 100%;">
<img src="screenshots/combined/day_chart.png" width="33%"><img src="screenshots/combined/light_dark.png" width="33%"><img src="screenshots/combined/locations.png" width="33%"><img src="screenshots/combined/widgets.png" width="33%"><img src="screenshots/combined/multi_device.png" width="66%">
</p>

## Features

- Dusk/dawn phases **chart**
- **Location customization** with geocoding support
- Automatically updated **home screen widgets**

## Used technologies

- [Jetpack Navigation (aka "Navigation 2")](https://developer.android.com/jetpack/androidx/releases/navigation) - screen flows definition, backstack management 
- [Room](https://developer.android.com/jetpack/androidx/releases/room) - database for on-device location storage
- [Datastore](https://developer.android.com/jetpack/androidx/releases/datastore) - user preference storage
- [Hilt](https://dagger.dev/hilt/) - dependency injection
- [Retrofit](https://square.github.io/retrofit/) - network requests
- [Coroutines](https://kotlinlang.org/docs/coroutines-guide.html) - asynchronous/concurrent programming
- [Glance](https://developer.android.com/develop/ui/compose/glance) - compose-based home screen widgets
- [WorkManager](https://developer.android.com/jetpack/androidx/releases/work) - periodic widget updates
- [Osmdroid](https://github.com/osmdroid/osmdroid) - maps
