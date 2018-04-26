package jp.cordea.dsleyan

import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.ViewHolder

class MainListAdapter(
        items: List<MainSection>
) : GroupAdapter<ViewHolder>() {

    init {
        addAll(items.map {
            Section(MainListSection(it)).apply {
                addAll(it.items.map {
                    MainListItem(it)
                })
            }
        })
    }
}
