func calculateMetroFare(_ time:Int,_ stations:Int ) -> Double {
    if time < 0 || stations <= 0 {
        return -1
    }
    var fare: Double = 0.0
    var isPeakHours = false
    if time >= 900 && time <= 1700 {
        isPeakHours = true
    }
    if stations <= 5 {
        fare = 2
    }
    else if stations >= 6 && stations <= 10 {
        fare = 4
    } else {
        fare = 4
        let extraStations = stations - 10
        let extraFare = Double(extraStations) * 0.2
        fare += extraFare
    }
    if isPeakHours {
        fare = fare * 1.5
        fare = min(fare, 9)
    }
    else {
        fare = min(fare, 6)
    }
    return fare
}