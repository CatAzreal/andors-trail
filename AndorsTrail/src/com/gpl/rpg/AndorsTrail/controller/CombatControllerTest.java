package com.gpl.rpg.AndorsTrail.controller;

import com.gpl.rpg.AndorsTrail.model.actor.Actor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gonk on 02.02.2020.
 */
public class CombatControllerTest {
    @Test
    public void getAverageDamagePerHit() throws Exception {
        Actor attacker = new Actor(null, false, false);
        attacker.attackChance = 100;
        attacker.damagePotential.set(5, 3);

        Actor target = new Actor(null, false, false);
        target.damageResistance = 3;
        target.blockChance = 50;

        float averageDamagePerHit = CombatController.getAverageDamagePerHit(attacker, target);
        assertEquals(0.5, averageDamagePerHit, 0.01);

        attacker.criticalSkill = 30;
        attacker.criticalMultiplier = 2.5f;

        averageDamagePerHit = CombatController.getAverageDamagePerHit(attacker, target);
        assertEquals(1.038, averageDamagePerHit, 0.01);
    }

}