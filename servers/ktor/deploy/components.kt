val appName = "queuebert-$env-ktor"

val serverContainer = container {
  val appServerName = "$appName-server"
  name = appServerName

  image {
    name = appServerName
    directory = "servers/ktor/deploy/server"
    buildArgs {
      buildArg { "env" to env }
    }
  }

  memoryReservation = 512
  memory = 768
  cpu = 128

  ports {
    port {
      containerPort = 8080
    }
  }

  jsonFileLog {
    maxFileSize = "500m"
    maxFileCount = 2
  }
}


val serverTask = ec2Task {
  name = appName
  taskRole = "queuebert-$env"

  containers {
    +serverContainer
  }
}
