package chapter4

interface Person {
    val nickname: String
}

class PrivateUser(override val nickname: String) : Person   // Directly override property

class SubscribingUser(val email: String) : Person {
    override val nickname: String
        get() = email.substringBefore('@') // Custom getter
}

class FacebookUser(val accountId: Int) : Person {
    override val nickname = getFacebookName(accountId)
}

fun getFacebookName(accountId: Int): String = "acc$accountId"