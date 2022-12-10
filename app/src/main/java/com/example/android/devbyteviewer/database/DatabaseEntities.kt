package com.example.android.devbyteviewer.database
import com.example.android.devbyteviewer.domain.DevByteVideo



fun List<DatabaseVideo>.asDomainModel(): List<DevByteVideo> {
    return map {
        DevByteVideo(
            url = it.url,
            title = it.title,
            description = it.description,
            updated = it.updated,
            thumbnail = it.thumbnail)
    }
}
