/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.compose.jetchat.data

import com.example.compose.jetchat.R
import com.example.compose.jetchat.conversation.ConversationUiState
import com.example.compose.jetchat.conversation.Message
import com.example.compose.jetchat.profile.ProfileScreenState

private val initialMessages = listOf(
    Message(
        "я",
        "До свидания!",
        "8:07 PM"
    ),
    Message(
        "я",
        "Спасибо!",
        "8:06 PM",
        R.drawable.sticker
    ),
    Message(
        "Доктор Врач",
        "Можете принять тестовую таблетку",
        "8:05 PM"
    ),
    Message(
        "Доктор Врач",
        "@ТестоваяБелка5634 обрати внимание на сыпь на руке",
        "8:05 PM"
    ),
    Message(
        "Доктор Второй",
        "Ясность нашей позиции очевидна: новая модель организационной деятельности предполагает независимые способы реализации как самодостаточных, так и внешне зависимых концептуальных решений. Противоположная точка зрения подразумевает, что представители современных социальных резервов, которые представляют собой яркий пример континентально-европейского типа политической культуры, будут объединены в целые кластеры себе подобных. Безусловно, базовый вектор развития, а также свежий взгляд на привычные вещи — безусловно открывает новые горизонты для новых принципов формирования материально-технической и кадровой базы.",
        "8:04 PM"
    ),
    Message(
        "я",
        "Ясность открывает новые горизонты для новых принципов формирования материально-технической и кадровой базы?",
        "8:03 PM"
    )
)

val exampleUiState = ConversationUiState(
    initialMessages = initialMessages,
    channelName = "#консультации",
    channelMembers = 3
)

/**
 * Example colleague profile
 */
val colleagueProfile = ProfileScreenState(
    userId = "12345",
    photo = R.drawable.someone_else,
    name = "Доктор Врач",
    status = "Не в сети",
    displayName = "Доктор Врач",
    position = "Врач-дерматолог СПИД-центра",
    twitter = "vk.com/ДокторВрач",
    timeZone = "12:25 (Екатеринбург)",
    commonChannels = "2"
)

/**
 * Example "я" profile.
 */
val meProfile = ProfileScreenState(
    userId = "я",
    photo = R.drawable.ali,
    name = "Тестовая белка",
    status = "Онлайн",
    displayName = "Тестовая белка #5634",
    position = "Пациент",
    twitter = "-",
    timeZone = "12:00 (Серов)",
    commonChannels = null
)
