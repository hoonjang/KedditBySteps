package net.huray.kedditbysteps.featrues.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import net.huray.kedditbysteps.R
import net.huray.kedditbysteps.commons.adapter.ViewType
import net.huray.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import net.huray.kedditbysteps.commons.extensions.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
            = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {

    }

}
