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
import me.talonwettstein.labofdoors.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LabOfDoors.MODID);

    private static final CreativeModeTab.DisplayItemsGenerator displayItemsGenerator = (parameters, output) -> {
        // Items
        output.accept(ModItems.CORRUPTION_DUST.get());
        output.accept(ModItems.REFINED_CORRUPTION_DUST.get());

        // Blocks
        output.accept(ModBlocks.CORRUPTION_DUST_BLOCK.get());
    };

    // Creative Mode Tabs
    public static final RegistryObject<CreativeModeTab> LABOFDOORS_MAIN_CTAB =
            CREATIVE_MODE_TABS.register("labofdoors_main_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.CORRUPTION_DUST.get()))
                            .title(Component.translatable("creativetab.labofdoors_main_tab"))
                            .displayItems(displayItemsGenerator)
                            .build());

    // Register Method
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
