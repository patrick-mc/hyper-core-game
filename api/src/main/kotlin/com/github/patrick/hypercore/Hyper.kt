/*
 * Copyright (C) 2020 PatrickKR
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * Contact me on <mailpatrickkr@gmail.com>
 */

package com.github.patrick.hypercore

import com.github.noonmaru.tap.LibraryLoader.load
import com.github.patrick.hypercore.entity.HyperCreeper
import com.github.patrick.hypercore.entity.HyperEntityManager
import com.github.patrick.hypercore.entity.HyperSkeleton
import com.github.patrick.hypercore.entity.HyperZombie
import org.bukkit.entity.Player

object Hyper {
    val ENTITY: HyperEntityManager = load(HyperEntityManager::class.java)

    var hyperPlayer: Player? = null

    var hyperTask: Runnable? = null

    val hyperSkeletons = HashSet<HyperSkeleton>()

    val hyperCreepers = HashMap<Int, HyperCreeper>()

    val hyperZombies = HashSet<HyperZombie>()
}