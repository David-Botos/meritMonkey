This is Merit, the Android app built in Kotlin that locks down your phone for focus periods, detecting when you try to open other apps, and requires you to explain your reasoning for breaking your focused work period.  
The intention is not to be judgemental but to identify and call to the forefront patterns of what may be breaking your focus.


WIP: Project structure
merit/
├── AndroidManifest.xml   # Declares app permissions, components, and metadata
├── java/
│   └── com/merit/focusTime
│       ├── MainActivity.kt   # Main entry point of the app
│       │
│       ├── application/     # Application-level code
│       │   └── FocusTimerApplication.kt   # Custom Application class for app-wide initialization
│       │
│       ├── data/           # Data layer - handles data operations
│       │   ├── repository/  # Implements repository interfaces
│       │   │   └── TimerRepositoryImpl.kt  # Actual implementation of data operations
│       │   └── local/       # Local data storage
│       │       └── preferences/  # App preferences and settings storage
│       │
│       ├── domain/         # Business logic layer
│       │   ├── model/      # Core business models/entities
│       │   ├── repository/ # Repository interfaces
│       │   └── usecase/    # Business logic use cases
│       │
│       ├── service/        # Android Services
│       │   ├── TimerService.kt        # Handles timer operations
│       │   └── AppMonitoringService.kt # Monitors app switching
│       │
│       └── ui/            # User interface layer
│           ├── components/     # Reusable UI components
│           ├── screens/     # Main screens / pages :Fragments()
│           ├── navigation/     # Navigation setup
│           │   └── NavigationGraph.kt/  # Theme and styling
│           └── theme/  # Theme and styling
└── res/                  # Android resources
    ├── layout/          # XML layout files
    └── values/          # App resources (strings, colors, etc.)