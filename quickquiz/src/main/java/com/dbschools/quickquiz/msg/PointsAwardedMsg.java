/*
 * QuickQuiz
 * Copyright (C) 2005 David C. Briccetti
 * www.davebsoft.com
 *
 * This program is free software; you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation; either version 2 of the License, or 
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software Foundation, 
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package com.dbschools.quickquiz.msg;

import java.util.Collection;

import com.dbschools.quickquiz.PointsAwardeeInfo;

/**
 * Information about points awarded to a taker.
 * 
 * @author David C. Briccetti
 */
public final class PointsAwardedMsg extends AbstractBroadcastMsg {
    private static final long serialVersionUID = -7481807369619569986L;
    private final Collection<PointsAwardeeInfo> pointsAwardeesInfo;
    
    public PointsAwardedMsg(Collection<PointsAwardeeInfo> pointsAwardeesInfo) {
        super();
        this.pointsAwardeesInfo = pointsAwardeesInfo;
    }

    public Collection<PointsAwardeeInfo> getPointsAwardeesInfo() {
        return pointsAwardeesInfo;
    }

}