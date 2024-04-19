/*
 * Copyright © 2017-2024 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.wireguard.bridge.activity;

import android.os.Bundle;

import com.wireguard.android.bridge.R;
import com.wireguard.android.bridge.databinding.SettingsActivityBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class SettingsActivity extends AppCompatActivity {

    private SettingsActivityBinding ui;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = DataBindingUtil.setContentView(this, R.layout.settings_activity);
    }
}
