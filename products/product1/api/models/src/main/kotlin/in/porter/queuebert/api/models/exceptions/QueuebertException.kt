package `in`.porter.queuebert.api.models.exceptions

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties("stack_trace", "cause", "suppressed", "localized_message")
open class QueuebertException(override val message: String) : Exception(message)
