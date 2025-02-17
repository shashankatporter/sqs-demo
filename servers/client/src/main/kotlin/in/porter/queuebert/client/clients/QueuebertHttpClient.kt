package `in`.porter.queuebert.client.clients

import `in`.porter.kotlinutils.sqs.coroutines.client.SQSClient
import `in`.porter.queuebert.api.models.async.AsyncJob
import javax.inject.Inject

class QueuebertHttpClient
@Inject
constructor(
  private val client: SQSClient
) : QueuebertClient {

  override suspend fun publishJob(job: AsyncJob) {
    TODO()
  }

}
