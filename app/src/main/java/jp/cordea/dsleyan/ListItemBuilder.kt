package jp.cordea.dsleyan

@DslMarker
annotation class MainListDsl

@MainListDsl
class ItemBuilder {

    var title: String = ""

    fun build(): MainItem =
            MainItem(title)
}

@MainListDsl
class SectionBuilder {

    var title: String = ""

    private val items = mutableListOf<MainItem>()

    fun item(action: ItemBuilder.() -> Unit) {
        items += ItemBuilder().apply { action() }.build()
    }

    fun build(): MainSection =
            MainSection(title, items)
}

@MainListDsl
class ListBuilder {

    private val items = mutableListOf<MainSection>()

    fun section(action: SectionBuilder.() -> Unit) {
        items += SectionBuilder().apply { action() }.build()
    }

    fun build(): List<MainSection> =
            items
}

@MainListDsl
fun list(action: ListBuilder.() -> Unit): List<MainSection> =
        ListBuilder().apply { action() }.build()
