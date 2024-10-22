// // ui/navigation/NavigationGraph.kt
// class NavigationGraph {
//     // Define route destinations (like React route constants)
//     object Destinations {
//         const val TIMER_SCREEN = "timerScreen"
//         const val SETTINGS_SCREEN = "settingsScreen"
//     }

//     // Define navigation actions (like navigation functions in React)
//     class Actions(private val navController: NavController) {
//         // Navigate to settings
//         fun navigateToSettings() {
//             navController.navigate(R.id.toSettings)
//         }

//         // Navigate to timer with parameters
//         fun navigateToTimer(initialMinutes: Int = 25) {
//             navController.navigate(
//                 R.id.timerScreen,
//                 bundleOf("initialMinutes" to initialMinutes)
//             )
//         }

//         // Go back
//         fun navigateBack() {
//             navController.popBackStack()
//         }
//     }
// }

// // Usage in MainActivity to set up navigation
// class MainActivity : AppCompatActivity() {
//     override fun onCreate(savedInstanceState: Bundle?) {
//         super.onCreate(savedInstanceState)
//         setContentView(R.layout.activity_main)

//         // Set up navigation
//         val navHostFragment = supportFragmentManager
//             .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//         val navController = navHostFragment.navController

//         // Create navigation actions
//         val navigationActions = NavigationGraph.Actions(navController)
//     }
// }