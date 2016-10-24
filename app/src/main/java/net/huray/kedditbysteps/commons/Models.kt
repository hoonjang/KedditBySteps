package net.huray.kedditbysteps.commons

import android.os.Parcel
import android.os.Parcelable
import net.huray.kedditbysteps.commons.adapter.AdapterConstants
import net.huray.kedditbysteps.commons.adapter.ViewType
import net.huray.kedditbysteps.commons.extensions.createParcel

data class RedditNews(val after: String,
                      val before: String,
                      val news: List<RedditNewsItem>) : Parcelable {

    companion object {
        @JvmField @Suppress("unused")
        val CREATOR = createParcel { RedditNews(it) }
    }

    protected constructor(parcelIn: Parcel) : this(
            parcelIn.readString(),
            parcelIn.readString(),
            mutableListOf<RedditNewsItem>().apply {
                parcelIn.readTypedList(this, RedditNewsItem.CREATOR)
            }
    )

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(after)
        dest.writeString(before)
        dest.writeTypedList(news)
    }

    override fun describeContents(): Int = 0

}

data class RedditNewsItem(
        var author: String,
        var title: String,
        var numComments: Int,
        val created: Long,
        val thumbnail: String,
        var url: String
) : ViewType, Parcelable {

    companion object {
        @JvmField @Suppress("unused")
        val CREATOR = createParcel { RedditNewsItem(it) }
    }

    protected constructor(parcelIn: Parcel) : this(
            parcelIn.readString(),
            parcelIn.readString(),
            parcelIn.readInt(),
            parcelIn.readLong(),
            parcelIn.readString(),
            parcelIn.readString()
    )

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(author)
        dest.writeString(title)
        dest.writeInt(numComments)
        dest.writeLong(created)
        dest.writeString(thumbnail)
        dest.writeString(url)
    }

    override fun describeContents(): Int = 0

    override fun getViewType(): Int = AdapterConstants.NEWS
}