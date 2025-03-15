/*
 * MIT License
 *
 * Copyright (c) 2025 Talon Wettstein
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.talonwettstein.labofdoors.item;

import me.talonwettstein.labofdoors.LabOfDoors;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LabOfDoors.MODID);

    // Standards
    public static final net.minecraft.world.item.Rarity BaseRarity = Rarity.RARE;

    // Items

    ///  Corruption Dust -- Dust gathered from Biome "Corrupted Forest"
    public static final RegistryObject<Item> CORRUPTION_DUST = ITEMS.register("corruption_dust",
            () -> new Item(new Item.Properties().rarity(BaseRarity)));
    /// Refined Corruption Dust -- Smelted/Blasted Dust in Ingot Form.
    public static final RegistryObject<Item> REFINED_CORRUPTION_DUST = ITEMS.register("refined_corruption_dust",
            () -> new Item(new Item.Properties().rarity(BaseRarity)));


    // Register Method
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
