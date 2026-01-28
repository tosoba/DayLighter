<div align="center">
  <img src="screenshots/combined/top_banner.png">

## About

<b><i>DayLighter</i></b> is a Material 3 themed android app for tracking <b>dusk/dawn phases</b> as well as <b>golden/blue hours</b>.

</div>

## Screenshots

<p align="center" width="100%">
<img src="screenshots/combined/day_chart.png" width="33%"><img src="screenshots/combined/light_dark.png" width="33%"><img src="screenshots/combined/locations.png" width="33%"><img src="screenshots/combined/widgets.png" width="33%"><img src="screenshots/combined/multi_device.png" width="66%">
</p>

### Features

- Dusk/dawn phases <b>chart</b>
- <b>Location customization</b> with geocoding support
- Automatically updated <b>home screen widgets</b>

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
