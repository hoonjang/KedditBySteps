package net.huray.kedditbysteps.featrues.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_item.view.*
import net.huray.kedditbysteps.R
import net.huray.kedditbysteps.commons.RedditNewsItem
import net.huray.kedditbysteps.commons.adapter.ViewType
import net.huray.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import net.huray.kedditbysteps.commons.extensions.getFriendlyTime
import net.huray.kedditbysteps.commons.extensions.inflate
import net.huray.kedditbysteps.commons.extensions.loadImg

class NewsDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
            = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }

}
