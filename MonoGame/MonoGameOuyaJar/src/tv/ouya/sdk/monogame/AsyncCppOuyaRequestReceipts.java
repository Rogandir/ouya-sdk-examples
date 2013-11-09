/*
 * Copyright (C) 2012, 2013 OUYA, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tv.ouya.sdk.monogame;

import android.util.Log;


public class AsyncCppOuyaRequestReceipts {
	
	static final String LOG_TAG = "AsyncCppOuyaRequestReceipts";

	public static void invoke() {
		
		Log.i(LOG_TAG, "invoke");

		CallbacksRequestReceipts callbacks = new CallbacksRequestReceipts();

		// store for access
		IOuyaActivity.SetCallbacksRequestReceipts(callbacks);

		// invoke service
		MonoGameOuyaPlugin.getReceiptsAsync();
	}
}