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

package com.github.patrick.hypercore.plugin

import com.github.patrick.hypercore.Hyper.ENTITY
import com.github.patrick.hypercore.Hyper.hyperCreepers
import com.github.patrick.hypercore.command.HyperCommand
import com.github.patrick.hypercore.listener.HyperListener
import com.github.patrick.hypercore.task.HyperScheduler
import org.bukkit.Bukkit.getPluginManager
import org.bukkit.Bukkit.getScheduler
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityTargetLivingEntityEvent
import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused", "UsePropertyAccessSyntax")
class HyperCorePlugin : JavaPlugin() {
    override fun onEnable() {
        ENTITY.registerHyperEntities()
        getCommand("hyper").setExecutor(HyperCommand())
        getScheduler().runTaskTimer(this, HyperScheduler(), 0, 1)
        getPluginManager().registerEvents(HyperListener(), this)
    }
}