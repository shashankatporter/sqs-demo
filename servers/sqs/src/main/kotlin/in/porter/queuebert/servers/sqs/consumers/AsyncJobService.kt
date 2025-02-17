package `in`.porter.queuebert.servers.sqs.consumers

import `in`.porter.queuebert.api.models.async.AsyncJob
import javax.inject.Inject

class AsyncJobService
@Inject
constructor(
) {

  suspend fun invoke(job: AsyncJob) {
     TODO()
  }
}
