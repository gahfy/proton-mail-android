/*
 * Copyright (c) 2020 Proton Technologies AG
 * 
 * This file is part of ProtonMail.
 * 
 * ProtonMail is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ProtonMail is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ProtonMail. If not, see https://www.gnu.org/licenses/.
 */
package ch.protonmail.android.uitests.robots.mailbox.spam

import ch.protonmail.android.uitests.robots.mailbox.MailboxRobotInterface
import ch.protonmail.android.uitests.testsHelper.uiactions.UIActions

/**
 * [SpamRobot] class implements [MailboxRobotInterface],
 * contains actions and verifications for Spam mailbox functionality.
 */
open class SpamRobot : MailboxRobotInterface {

    override fun swipeLeftMessageAtPosition(position: Int): SpamRobot {
        super.swipeLeftMessageAtPosition(position)
        return this
    }

    override fun longClickMessageOnPosition(position: Int): SpamRobot {
        super.longClickMessageOnPosition(position)
        return this
    }

    fun moreOptions(): SpamRobot {
        UIActions.system.clickMoreOptionsButton()
        return this
    }
}
