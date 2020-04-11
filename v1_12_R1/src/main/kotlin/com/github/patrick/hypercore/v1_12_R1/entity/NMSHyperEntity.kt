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

package com.github.patrick.hypercore.v1_12_R1.entity

import com.github.patrick.hypercore.entity.HyperEntity
import com.github.patrick.hypercore.v1_12_R1.entity.NMSHyperEntityRegistry.getInstance
import net.minecraft.server.v1_12_R1.Entity
import org.bukkit.Location
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld

@Suppress("unused")
class NMSHyperEntity : HyperEntity {
    override fun registerHyperEntities() {
        registerHyperEntity(51, "Skeleton", NMSHyperSkeleton::class.java)
    }

    private fun registerHyperEntity(id: Int, name: String, entityClass: Class<out Entity?>) = getInstance().putCustomEntity(id, name, entityClass)

    override fun summonSkeleton(location: Location): NMSHyperSkeleton {
        val entity = NMSHyperSkeleton((location.world as CraftWorld).handle)
        entity.entity.teleport(location)
        return entity
    }
}