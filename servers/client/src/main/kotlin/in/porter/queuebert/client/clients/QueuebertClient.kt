package `in`.porter.queuebert.client.clients

import `in`.porter.queuebert.api.models.async.AsyncJob


interface QueuebertClient {
  suspend fun publishJob(job: AsyncJob)
}
