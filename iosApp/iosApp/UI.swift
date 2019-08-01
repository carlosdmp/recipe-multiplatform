//
//  UI.swift
//  iosApp
//
//  Created by Miguel Platero, C. on 31/07/2019.
//

import Foundation
import app

public class UI: Kotlinx_coroutines_coreCoroutineDispatcher {
    override public func dispatch(context: KotlinCoroutineContext, block: Kotlinx_coroutines_coreRunnable) {
        DispatchQueue.main.async {
            block.run()
        }
}

