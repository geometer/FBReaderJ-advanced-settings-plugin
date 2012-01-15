/*
 * Copyright (C) 2009-2011 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.fbreader.plugin.advanced_settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import org.geometerplus.android.fbreader.api.*;

public class AdvancedSettingsActivity extends PreferenceActivity implements ApiClientImplementation.ConnectionListener {
	private ApiClientImplementation myApi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		myApi = new ApiClientImplementation(this, this);

		setTitle(R.string.short_title);
	}

	@Override
	protected void onResume() {
		myApi.connect();
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onStop() {
		myApi.disconnect();
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	// implements ApiClientImplementation.ConnectionListener
	public void onConnected() {
	}
}
