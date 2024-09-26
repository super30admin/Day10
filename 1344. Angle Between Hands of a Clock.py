"""
https://leetcode.com/problems/angle-between-hands-of-a-clock/
"""
class Solution:
    def angleClock(self, hour: int, minutes: int) -> float:
        ####O(1), O(1)
        """60mins=>360 degree and 12 hours=>360 degree"""
        one_min_angle = 6  ###Time 1, Space 1 O
        one_hour_angle = 30  ###Time 1, Space 1 O
        """Input hour = 12, minutes = 30"""
        minangle = one_min_angle * minutes
        """at 12 its  0 hours, 0 degrees """
        hourangle = ((hour % 12) + (minutes / 60)) * one_hour_angle
        """hour angle follows minutes hands angles proportions as-well"""
        diff = abs(hourangle - minangle)
        return min(diff, 360 - diff)