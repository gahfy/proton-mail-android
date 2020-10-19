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

package ch.protonmail.android.viewmodel

import android.text.TextUtils
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ch.protonmail.android.api.models.room.messages.MessagesDao
import ch.protonmail.android.core.UserManager
import ch.protonmail.android.utils.UserUtils
import ch.protonmail.android.viewmodel.ManageLabelsDialogViewModel.ViewState.*
import ch.protonmail.android.views.ThreeStateButton
import javax.inject.Inject
import javax.inject.Named

class ManageLabelsDialogViewModel @Inject constructor(
    @Named("messages") private val messagesDao: MessagesDao,
    private val userManager: UserManager
) : ViewModel() {

    sealed class ViewState {
        object ShowMissingColorError : ViewState()
    }

    val viewState: MutableLiveData<ViewState> = MutableLiveData()

    fun onDoneClicked(
        isCreationMode: Boolean,
        newLabelColor: String?,
        checkedLabelIds: List<String>,
        isShowCheckboxes: Boolean,
        mArchiveCheckboxState: Int
    ) {

        if (isCreationMode) {
            if (newLabelColor.isNullOrEmpty()) {
                viewState.value = ShowMissingColorError
//                showToast(getActivity(), R.string.please_choose_color, Toast.LENGTH_SHORT)
            } else {
//                mCreationMode = false
//                onSaveClicked()
            }
        } else {
//            val maxLabelsAllowed = UserUtils.getMaxAllowedLabels(userManager)
//            if (checkedLabelIds.size > maxLabelsAllowed) {

//                if (isAdded()) {
//                    getActivity().showToast(String.format(getString(R.string.max_labels_selected), maxLabelsAllowed), Toast.LENGTH_SHORT)
//                }
//                return
//            }
            if (isShowCheckboxes) {
                if (mArchiveCheckboxState == ThreeStateButton.STATE_CHECKED ||
                    mArchiveCheckboxState == ThreeStateButton.STATE_PRESSED) {
                    // also archive
//                    mLabelStateChangeListener.onLabelsChecked(getCheckedLabels(), if (mMessageIds == null) null else getUnchangedLabels(), mMessageIds, mMessageIds)
                } else {
//                    mLabelStateChangeListener.onLabelsChecked(getCheckedLabels(), if (mMessageIds == null) null else getUnchangedLabels(), mMessageIds)
                }
            } else if (!isShowCheckboxes) {
//                mLabelCreationListener.onLabelsDeleted(getCheckedLabels())
            }
//            dismissAllowingStateLoss()
        }
    }


}
