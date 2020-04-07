package com.Jojoxjmwa.Testmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Testmod.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll();
        new Item().setRegistryName(Testmod.MODID, "first_item").setUnlocalizedName(Testmod.MODID + "." + "first_item").setCreativeTab(CreativeTabs.MISC);
        };


    }
