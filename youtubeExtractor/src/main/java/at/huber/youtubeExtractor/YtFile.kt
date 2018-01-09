package at.huber.youtubeExtractor

class YtFile internal constructor(
        /**
         * Format data for the specific file.
         */
        val format: Format?,
        /**
         * The url to download the file.
         */
        val url: String) {

    /**
     * Format data for the specific file.
     */
    @Deprecated("")
    fun getMeta(): Format? {
        return format
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val ytFile = o as YtFile?

        if (if (format != null) format != ytFile!!.format else ytFile!!.format != null) return false
        return url == ytFile.url
    }

    override fun hashCode(): Int {
        var result = format?.hashCode() ?: 0
        result = 31 * result + url.hashCode()
        return result
    }

    override fun toString(): String {
        return "YtFile{" +
                "format=" + format +
                ", url='" + url + '\'' +
                '}'
    }
}
