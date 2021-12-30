package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User youngAge = new ZGeneration("ZGeneration");
        User middleAge = new YGeneration("YGeneration");
        User oldAge = new Millenials("Millennial's");
        //When
        String youngAgeShare = youngAge.sharePost();
        System.out.println("youngAgeShare:" + youngAgeShare);
        String middleAgeShare = middleAge.sharePost();
        System.out.println("middleAgeShare:" + middleAgeShare);
        String oldAgeShare = oldAge.sharePost();
        System.out.println("oldAge:" + oldAgeShare);
        //Then
        assertEquals(oldAgeShare, "Facebook published");
        assertEquals(middleAgeShare, "SnapChat published");
        assertEquals(youngAgeShare, "Twitter published");
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User youngAge = new ZGeneration("ZGeneration");
        //When
        String fromMethodShare = youngAge.sharePost();
        System.out.println("fromMethodShare:" + fromMethodShare);

        youngAge.setSocialPublisher(new FacebookPublisher());
        fromMethodShare = youngAge.sharePost();
        System.out.println("newYoungAgeSocial:" + fromMethodShare);
    }
}

