import Models.Category
import Models.TransactionType

data class UITransaction(
    val amount: Double,
    val category: Category,
    val transactionType: TransactionType,
    val date: String,
)