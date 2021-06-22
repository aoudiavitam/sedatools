/**
 * Copyright French Prime minister Office/DINSIC/Vitam Program (2015-2019)
 * <p>
 * contact.vitam@programmevitam.fr
 * <p>
 * This software is developed as a validation helper tool, for constructing Submission Information Packages (archives
 * sets) in the Vitam program whose purpose is to implement a digital archiving back-office system managing high
 * volumetry securely and efficiently.
 * <p>
 * This software is governed by the CeCILL 2.1 license under French law and abiding by the rules of distribution of free
 * software. You can use, modify and/ or redistribute the software under the terms of the CeCILL 2.1 license as
 * circulated by CEA, CNRS and INRIA archiveTransfer the following URL "http://www.cecill.info".
 * <p>
 * As a counterpart to the access to the source code and rights to copy, modify and redistribute granted by the license,
 * users are provided only with a limited warranty and the software's author, the holder of the economic rights, and the
 * successive licensors have only limited liability.
 * <p>
 * In this respect, the user's attention is drawn to the risks associated with loading, using, modifying and/or
 * developing or reproducing the software by the user in light of its specific status of free software, that may mean
 * that it is complicated to manipulate, and that also therefore means that it is reserved for developers and
 * experienced professionals having in-depth computer knowledge. Users are therefore encouraged to load and test the
 * software's suitability as regards their requirements in conditions enabling the security of their systems and/or data
 * to be ensured and, more generally, to use and operate it in the same conditions as regards security.
 * <p>
 * The fact that you are presently reading this means that you have had knowledge of the CeCILL 2.1 license and that you
 * accept its terms.
 */
package fr.gouv.vitam.tools.sedalib.metadata;

import fr.gouv.vitam.tools.sedalib.metadata.management.*;
import fr.gouv.vitam.tools.sedalib.metadata.namedtype.*;

import java.util.LinkedHashMap;

/**
 * The Class ManagementMetadata.
 * <p>
 * Class for SEDA element ManagementMetadata.
 * <p>
 * In DataObjectPackage metadata.
 * <p>
 * Standard quote: "Bloc des métadonnées de gestion par défaut des
 * objets-données."
 */
public class ManagementMetadata extends ComplexListType {

    /**
     * Init metadata map.
     */
    @ComplexListMetadataMap(isExpandable = true)
    static final public LinkedHashMap<String, ComplexListMetadataKind> metadataMap;
    static {
        metadataMap = new LinkedHashMap<String, ComplexListMetadataKind>();
        metadataMap.put("ArchivalProfile",
                new ComplexListMetadataKind(StringType.class, false));
        metadataMap.put("ServiceLevel", new ComplexListMetadataKind(StringType.class, false));
        metadataMap.put("AcquisitionInformation",
                new ComplexListMetadataKind(StringType.class, false));
        metadataMap.put("LegalStatus", new ComplexListMetadataKind(StringType.class, false));
        metadataMap.put("OriginatingAgencyIdentifier",
                new ComplexListMetadataKind(StringType.class, false));
        metadataMap.put("SubmissionAgencyIdentifier",
                new ComplexListMetadataKind(StringType.class, false));
        metadataMap.put("StorageRule", new ComplexListMetadataKind(StorageRule.class, false));
        metadataMap.put("AppraisalRule", new ComplexListMetadataKind(AppraisalRule.class, false));
        metadataMap.put("AccessRule", new ComplexListMetadataKind(AccessRule.class, false));
        metadataMap.put("DisseminationRule",
                new ComplexListMetadataKind(DisseminationRule.class, false));
        metadataMap.put("ReuseRule", new ComplexListMetadataKind(ReuseRule.class, false));
        metadataMap.put("ClassificationRule",
                new ComplexListMetadataKind(ClassificationRule.class, false));
        metadataMap.put("HoldRule",
                new ComplexListMetadataKind(HoldRule.class, false));
        metadataMap.put("LogBook", new ComplexListMetadataKind(AnyXMLType.class, false));
        metadataMap.put("NeedAuthorization",
                new ComplexListMetadataKind(StringType.class, false));
    }

    /**
     * Instantiates a new Management.
     */
    public ManagementMetadata() {
        super("ManagementMetadata");
    }
}
